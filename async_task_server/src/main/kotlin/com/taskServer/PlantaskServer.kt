@file:JvmName("PlantaskServer")

package com.taskServer

import plantask.redis.RedisTaskLoader
import sz.AsynTask.AsyncTasksVerticle
import sz.PlanTaskService
import sz.SzEbeanConfig
import sz.scaffold.Application
import sz.scaffold.tools.logger.Logger

//
// Created by kk on 17/9/9.
//

object PlantaskServer {

    @JvmStatic
    fun main(args: Array<String>) {
        SzEbeanConfig.loadConfig()

        Application.setupVertx()

        Application.regOnStartHandler(10) {
            PlanTaskService.Start()
            AsyncTasksVerticle.deploy(Application.vertx)
            RedisTaskLoader.deploy(Application.vertx)
        }


        Application.regOnStopHanlder(10) {
            PlanTaskService.Stop()
            AsyncTasksVerticle.unDeploy()
            RedisTaskLoader.unDeploy()
        }

        Application.setupOnStartAndOnStop()

        Logger.debug("After Application.setupVertx()")
    }
}

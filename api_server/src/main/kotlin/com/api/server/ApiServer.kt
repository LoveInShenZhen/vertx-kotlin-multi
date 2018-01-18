@file:JvmName("ApiServer")

package com.api.server

import sz.SzEbeanConfig
import sz.scaffold.Application

//
// Created by kk on 17/8/29.
//
object ApiServer {

    @JvmStatic
    fun main(args: Array<String>) {
        SzEbeanConfig.loadConfig()

        Application.setupVertx()

        Application.runHttpServer()

    }

}

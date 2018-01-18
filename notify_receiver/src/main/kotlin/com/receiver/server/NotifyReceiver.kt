@file:JvmName("NotifyReceiver")

package com.receiver.server

import sz.SzEbeanConfig
import sz.scaffold.Application

//
// Created by kk on 17/8/29.
//
object NotifyReceiver {

    @JvmStatic
    fun main(args: Array<String>) {
        SzEbeanConfig.loadConfig()

        Application.setupVertx()

        Application.runHttpServer()

    }

}

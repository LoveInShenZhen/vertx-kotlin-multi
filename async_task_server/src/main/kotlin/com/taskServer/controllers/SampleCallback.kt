package com.taskServer.controllers

import sz.scaffold.controller.ApiController
import sz.scaffold.tools.json.toJsonPretty
import sz.scaffold.tools.logger.Logger

//
// Created by kk on 2018/1/11.
//
class SampleCallback : ApiController() {

    fun onNotifyCallback() {
        val headers = this.httpContext.request().headers().map { Pair<String, String>(it.key, it.value) }.toMap()
        val postForm = this.httpContext.request().formAttributes().map { Pair<String, String>(it.key, it.value) }.toMap()

        Logger.debug("headers:\n${headers.toJsonPretty()}")
        Logger.debug("form fields:\n${postForm.toJsonPretty()}")

        this.contentType("text/plain")
        this.httpContext.response().end("success")
    }

}
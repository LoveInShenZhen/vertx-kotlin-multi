package com.api.server.controller

import com.api.server.controller.reply.HelloReply
import jodd.datetime.JDateTime
import sz.scaffold.annotations.Comment
import sz.scaffold.controller.ApiController
import sz.scaffold.tools.logger.Logger

//
// Created by kk on 2017/12/13.
//

@Comment("测试代码")
class Sample : ApiController() {

    @Comment("测试接口")
    fun hello() : HelloReply {
        val reply = HelloReply()

        reply.msg = "Hello, today is ${JDateTime().toString("YYYY-MM-DD")}."

        Logger.debug(reply.msg)

        return reply
    }

}
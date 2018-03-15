# vertx-kotlin-multi
使用 kklongming/sz-vertx-kotlin 框架的多工程复杂应用的脚手架模板

# 构建步骤

## 构建 sz-vertx-kotlin
```bash
git clone https://github.com/kklongming/sz-vertx-kotlin.git

cd sz-vertx-kotlin

# 发布到本地的 mvaven 仓库, 我们的应用会通过本地的 maven 仓库添加 sz-vertx-kotlin 的依赖jar包
gradle publishToMavenLocal 

```

## 创建应用
```bash
# 创建应用很简单, 把代码clone下来即可
git clone https://github.com/LoveInShenZhen/vertx-kotlin-multi.git

# 测试运行
gradle run
```

* 测试连接: http://localhost:9000/api/builtin/doc/apiIndex

# 在此目录存放第三方非maven, 非 gradle 等依赖的jar文件

# 项目根目录下的 build.grade 下通过 flatDir 指定了根目录的 libs 目录为一个 repository
```

allprojects {
    apply plugin: 'org.jetbrains.kotlin.jvm'

    repositories {
        flatDir {
            dirs "$rootDir/libs"
        }
        mavenLocal()
        maven {
            name "aliyun-maven"
            url "http://maven.aliyun.com/nexus/content/groups/public/"
        }
        jcenter()
        ivy {
            name "typesafe-ivy-release"
            url "https://repo.typesafe.com/typesafe/ivy-releases"
            layout "ivy"
        }
//        maven { url 'https://jitpack.io' }
    }

```

# 添加依赖的方法
* 假定 libs 目录下有一个依赖的 third.jar 文件, 添加方法如下
```
# 文件名,去掉 .jar 后缀

dependencies {
    compile name: 'third'
}

```
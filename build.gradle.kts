buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
    	classpath("com.android.tools.build:gradle:7.1.0")
    	classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.31") // compose 1.0.5 require 1.5.31
    }
}

task<Delete>("clean") {
    delete = setOf(buildDir)
}

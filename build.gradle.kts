/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    java
    `maven-publish`
}

repositories {
    mavenLocal()
    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.3.2")
}

group = "com.github.zeroone3010"
version = "1.0-SNAPSHOT"
description = "opening-hours-parser"
java.sourceCompatibility = JavaVersion.VERSION_1_8

publishing {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
    }
}

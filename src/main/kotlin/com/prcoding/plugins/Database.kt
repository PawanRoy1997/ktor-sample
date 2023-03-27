package com.prcoding.plugins

import org.jetbrains.exposed.sql.Database


fun connect(): Database {
    val driverClassName = "org.h2.Driver"
    val jdbcURL = "jdbc:h2:mem:mydb"
    return  Database.connect(jdbcURL, driverClassName)
}


//Postgres
//dataSource {
//    pooled = true
//    driverClassName = "org.postgresql.Driver"
//	dialect = org.hibernate.dialect.PostgreSQLDialect
//    username = "user1"
//    password = "user1"
//    pooled = true
//}

//h2 test:
//dataSource {
//    dbCreate = "update"
//    url = "jdbc:h2:mem:testDb;MVCC=TRUE"
//}


dataSource {
    pooled = true
    driverClassName = "org.h2.Driver"
    username = "sa"
    password = ""
    pooled = true
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = true
    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory'
}
// environment specific settings
environments {
    development {
        dataSource {
            pooled = true
            driverClassName = "org.postgresql.Driver"
            dialect = org.hibernate.dialect.PostgreSQLDialect
            username = "user1"
            password = "user1"
            pooled = true
            dbCreate = "create-drop" // one of 'create', 'create-drop', 'update', 'validate', ''
            url="jdbc:postgresql://127.0.0.1:5432/licence_tool"
        }
    }
    test {

        dataSource {
            dbCreate = "update"
            url = "jdbc:h2:mem:testDb;MVCC=TRUE"
        }
    }
    production {
//        dataSource {
//            dbCreate = "update"
//            url = "jdbc:h2:prodDb;MVCC=TRUE"
//            pooled = true
//            properties {
//               maxActive = -1
//               minEvictableIdleTimeMillis=1800000
//               timeBetweenEvictionRunsMillis=1800000
//               numTestsPerEvictionRun=3
//               testOnBorrow=true
//               testWhileIdle=true
//               testOnReturn=true
//               validationQuery="SELECT 1"
//            }
//        }

        dataSource {
            pooled = true
            driverClassName = "org.postgresql.Driver"
            dialect = org.hibernate.dialect.PostgreSQLDialect
            username = "user1"
            password = "user1"
            pooled = true
            properties {
               maxActive = -1
               minEvictableIdleTimeMillis=1800000
               timeBetweenEvictionRunsMillis=1800000
               numTestsPerEvictionRun=3
               testOnBorrow=true
               testWhileIdle=true
               testOnReturn=true
               validationQuery="SELECT 1"
            }
        }
    }
}

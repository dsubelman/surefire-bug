# surefire-bug

### Replicates Surefire v3.3.0-M6 bug [SUREFIRE-2063](https://issues.apache.org/jira/browse/SUREFIRE-2063)

Test using v3.3.0-M5 (doesn't fail):

    mvn clean install -P m5

Test using v3.3.0-M6 (fail):

    mvn clean install -P m6


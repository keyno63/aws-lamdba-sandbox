JAR_HOME="${HOME}/.ivy2/cache/com.amazonaws/aws-java-sdk-core/jars"
JAR1="${JAR_HOME}/aws-java-sdk-core-1.10.5.jar"
JAR_HOME2="${HOME}/.ivy2/cache/com.amazonaws/aws-java-sdk-events/jars"
JAR2="${JAR_HOME}/aws-java-sdk-events-1.1.0.jar"
export CLASSPATH=.:${JAR1}:${JAR2}
javac src/main/java/example/Hello.java
jar -cvf Hello.jar src/main/java/example/*.class
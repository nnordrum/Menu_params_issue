java -server -XX:MaxPermSize=512m -XX:+UseConcMarkSweepGC -Xmx512M -Xss2M -jar `dirname $0`/sbt-launcher.jar "$@"

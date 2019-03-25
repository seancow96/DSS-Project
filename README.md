#Sample Distributed Systems Project



Clone this respositry from github and then run:
```
mvn "-Dexec.args=-classpath %classpath services.BedServer" -Dexec.executable=$JAVA_HOME/bin/java -Dexec.classpathScope=runtime org.codehaus.mojo:exec-maven-plugin:1.2.1:exec
```
to run the bed server (We can also run it from NetBeans but this will be handy when deploy it)

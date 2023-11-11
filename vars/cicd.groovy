     
def gitDownload(repo)
{ git "https://github.com/intelliqittrainings/${repo}.git"
}
def buildmaven()
{
  sh 'mvn package'
}
def tomcatdeploy(name,ip,context)
{
sh "scp /var/lib/jenkins/workspace/${name}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${context}.war"
}

def runselinium(name)
{
sh "java -jar /var/lib/jenkins/workspace/${name}/testing.jar"
}

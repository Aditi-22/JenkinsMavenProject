pipeline
{
agent any
environment
{
PATH = "/Applications/Maven/apache-maven-3.6.3/bin:$PATH"
}
stages
  {
   stage('Git checkout')
   {
   steps
   {
   git credentialsId: 'github', url: 'https://github.com/Aditi-22/JenkinsMavenProject'
   }
   }
   stage("Maven Build")
   {
   steps
   {
   sh "mvn clean package"
   }  
   }
  }
}

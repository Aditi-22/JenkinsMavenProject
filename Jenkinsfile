pipeline
{
    agent any
    stages
       {
           stage('Message')
           {
           steps
           {
               echo 'Job started'
           }
           }
           stage ('Build') 
           {
            steps {
                sh 'mvn -Dmaven.test.failure.ignore=true install' 
            }
            post 
               {
                success {
                    junit 'target/surefire-reports/**/*.xml' 
                }
               }
           }
       }
}

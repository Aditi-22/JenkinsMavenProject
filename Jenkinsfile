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
                //to clean and test the project
                sh 'mvn clean test' 
                //packaging
                sh 'mvn package'
            }
            post 
               {
                success {
                    junit 'target/surefire-reports/**/*.xml' 
                    archiveArtifacts 'target/*.jar'
                }
               }
           }
       }
}

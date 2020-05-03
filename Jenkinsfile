pipeline
{
    agent any
    tools {
        maven 'M3'
        jdk 'JDK1.8'
    }
    stages {
        stage ('Initialize') {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                '''
            }
        }
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

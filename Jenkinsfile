pipeline
{
    agent any
    stages
       {
           stage("Cleaning stage")
               {
               steps
                   {
                       sh "mvn -Dmaven.test.failure.ignore=true clean"
                    }
               }
          stage("Testing stage")
               {
               steps
                   {
                       sh "mvn -Dmaven.test.failure.ignore=true test"
                   }
               }
          stage("Packaging stage")
               {
               steps
                 {
                   sh "mvn -Dmaven.test.failure.ignore=true package"
                 }
               }
       }
}

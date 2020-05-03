pipeline
{
    agent any
    stages
       {
           stage("Cleaning stage")
               {
               steps
                   {
                      sh "mvn clean"
                   }
               }
          stage("Testing stage")
               {
               steps
                   {
                       sh "mvn test"
                   }
               }
          stage("Packaging stage")
               {
               steps
                 {
                   sh "mvn pkg"
                 }
               }
       }
}

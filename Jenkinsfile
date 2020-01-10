@Library('test-library') _
pipeline{
    agent any
    stages{
        stage("vars"){
            steps{
            script{
                foo.test()
            }
            } 
        }
        stage("src"){
            steps{
                script{
                    def bar = new org.foo.Bar()
                    bar.printName("src test")
                }

            }
        }
    }
}

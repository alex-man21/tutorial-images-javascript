
@Library('sharedlibs') _ 
import org.foo.*

def demo
// def applitools = new Applitools(this)

pipeline {
    agent any
  tools { nodejs 'Node16.6.1' } // Pick your node version between 8, 10, 12, or 14

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
        stage('init') {
            steps {
                script {
                    demo = load "testing.groovy"
                    demo.checkout()
                    // def applitools = new Applitools(this)
                }
                message("inside applitools sharedlib + init stage!")
            }
        }
        stage('build') {
            steps {
                    script {
                        demo.cleanInstall()
                        demo.echo();
                        demo.checkDirectory();
                    }
            }        
        }
        stage('test') {
            steps{
                Applitools(applitoolsApiKey: 'aSDUdmvAP1IwKVLmI996KxOk6MT3a2ZRaDGWRrn8Xh00110', notifyByCompletion: false, serverURL: 'https://eyes.applitools.com') {
                    script {
                        // sh "hi there"
                        demo.mvnTest()
                    }
                    ExternalGroovy()
                }
            }
        }
    }
}


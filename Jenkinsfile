
@Library('sharedlibs') _ 
import org.foo.*

def testingGroovy
// def utils = new Utilities(this)

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
                    testingGroovy = load "testing.groovy"
                }
                message("inside applitools sharedlib + init stage!")
            }
        }
        stage('build') {
            steps {
                Applitools(applitoolsApiKey: 'aSDUdmvAP1IwKVLmI996KxOk6MT3a2ZRaDGWRrn8Xh00110', notifyByCompletion: false, serverURL: 'https://eyes.applitools.com') {
                    script {
                        testingGroovy.echo();
                        // try {
                        //     testingGroovy.mvnTest();
                        // } catch (err) {
                        //     echo err.getMessage();
                        // }
                    }
                    externalScript()

                }
            }        
        }
    }
}


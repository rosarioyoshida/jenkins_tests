pipeline {
    agent any
	
	
	
    stages {
        stage("Checkout") {
            steps {
				script {
					checkout([
						$class: 'GitSCM',
						branches: [[name: params.BRANCH]],
						doGenerateSubmoduleConfigurations: false,
						extensions: [[$class: 'CloneOption', noTags: false, reference: '', shallow: true]],
						submoduleCfg: [],
						userRemoteConfigs: [[ url: 'https://github.com/rosarioyoshida/jenkins_tests.git' ]]
					])
				}
            }
        }
   }
}
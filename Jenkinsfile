pipeline {
    agent any
	
	options {
        disableConcurrentBuilds()
        timestamps()
        parallelsAlwaysFailFast()
        withCredentials([string(credentialsId: "github_rosarioyoshida", variable: 'hash')])
    }
	
	parameters {
		gitParameter(branch: '',
			branchFilter: 'origin/(.*)',
			defaultValue: 'develop',
			description: 'Selecione uma branch ou uma tag',
			name: 'BRANCH',
			quickFilterEnabled: true,
			selectedValue: 'DEFAULT',
			sortMode: 'NONE',
			tagFilter: '*',
			type: 'PT_BRANCH_TAG',
			useRepository: '/jenkins_tests',
			listSize: '1'
		)
    }
	
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
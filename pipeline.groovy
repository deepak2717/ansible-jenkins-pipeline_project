node {
stage('Stage 1') {
    echo 'Hello Jenkins 1'
}
stage('Stage 2') {
    echo 'Hello Jenkins 2'
}
stage 'Final stage'
// network connections
sh 'netstat -tunap'
// Waiting for user's input
try {
    timeout(time: 30, unit: 'MINUTES') {
	def userInput = input(
	id: 'userInput', message: 'Please enter your string', parameters: [
	[$class: 'TextParameterDefinition', defaultValue: '', description: 'CSI task', name: '']
	])
	echo ("String: "+userInput)
    }
} catch (err) {
    def user = err.getCauses()[0].getUser()
    echo "Aborted by:\n ${user}"
}
}

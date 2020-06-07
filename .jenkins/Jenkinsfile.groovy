node(master’) {
    stage(‘Checkout’) {
        checkout scm
    }
    stage('Build') {
        echo ‘Hello World’
    }
}


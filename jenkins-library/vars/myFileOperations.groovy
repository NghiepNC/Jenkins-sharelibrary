// vars/myFileOperations.groovy

def deleteFile(String filePath) {
    sh "rm -f ${filePath}"
}

def createDirectory(String dirPath) {
    sh "mkdir -p ${dirPath}"
}


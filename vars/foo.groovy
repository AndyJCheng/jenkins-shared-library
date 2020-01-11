//vars/foo.groovy
def printCommandName(commandName){
    return {
        echo 'the command name is:' + commandName
    }
}

def test(){
    echo 'this is pipeline shared library'
}
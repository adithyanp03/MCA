echo " Currently logged user : $(whoami)"
echo "Logname : $LOGNAME"
echo "Current shell : $SHELL"
echo "Home directory : $HOME"
echo "OS : $(uname -s)"
echo "Current path setting  : $PATH"
echo "Current working directory : $(pwd)"
echo "Current logged number : $(who | wc -l )"

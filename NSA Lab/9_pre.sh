echo " files "
find . -maxdepth 1 -type f -perm -u+rwx -exec ls -l {} + | awk '{print $9}'

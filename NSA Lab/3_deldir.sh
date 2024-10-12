echo "Enter the directory :"
read dir

echo "The dir content are :"
ls -R -l $dir

find $dir -type d -empty -delete
echo "All the folder with size 0 has been deleted"

ls

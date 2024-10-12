echo "The directories are : "
find $1 -type d

echo "The directories count : "
find $1 -type d | wc -l

echo "The files are : "
find $1 -type f

echo "The files count : "
find $1 -type f | wc -l

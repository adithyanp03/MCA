file1="$1"
file2="$2"
if cmp -s "$file1" "$file2";
then
	echo "Both files are same."
	rm "$file2"
	echo "$file2 is deleted.."
else
	echo "Files are different."
fi


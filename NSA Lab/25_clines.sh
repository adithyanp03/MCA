for file in *;do
	if [ -f "$file" ]
	then
		line=$(wc -l < "$file")
		echo "$file : $line"
	fi
done

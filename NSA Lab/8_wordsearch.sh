echo "enter the word"
read word
echo "enter the file name:"
read filename
echo "Enter the start line"
read start_line
echo "enter the end line"
read end_line
count=$(sed -n "${start_line},${end_line}p" "$filename" | grep -o "\<$word\>" | wc -l)
echo "the word '$word' occurred $count times b/w lines $start_line and $end_line in file '$filename'"

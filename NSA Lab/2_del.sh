echo "Enter the word to be deleted"
read word
grep -v "$word" "$1" > del.txt
echo "The Words Has been Deleted from del.txt"
cat del.txt > $1
cat $1

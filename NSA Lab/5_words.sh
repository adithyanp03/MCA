echo "Enter the files path to find the count of :"
read file
word_count=$(wc -w < "$file")
char_count=$(wc -m  < "$file")
symbol_count=$(grep -o '[^[:alnum:][:space:]]' "$file" | wc -l)
echo "word count is $word_count"
echo "charachter count is $char_count"
echo "special charachter count is $symbol_count"

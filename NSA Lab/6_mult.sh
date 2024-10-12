echo "Enter the number to print multiplication table : "
read num
echo "Multiplication Table :"
for i in 1 2 3 4 5 6 7 8 9 10
do
	result=$((num*i))
	echo "$num x $i = $result"
done

palindrome(){
	str=$1
	rev=""
	for ((i=${#str}-1;i>=0;i--));do
		rev="$rev${str:$i:1}"
	done
	if [ "$str" == "$rev" ];
	then
	echo "$str is a palindrome "
	else
	echo "$str is not a palindrome"
	fi
}

echo "Enter the string : "
read str
palindrome $str

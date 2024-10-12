echo "Enter the password :"
read pass
if [ ${#pass} -lt 8 ];
then
	echo "weak password : Password should have atleast of 8 charachter "
elif ! [[ "$pass" =~ [[:alpha:]] && "$pass" =~ [[:digit:]] ]];
then
	echo "weak password : Password should contain alphabets and digits"
elif ! [[ "$pass" =~ [[:upper:]] && "$pass" =~ [[:lower:]] ]];
then
	echo "weak password : Password should contain Uppercase and Lowercase"
else
	echo "Password is strong"
fi


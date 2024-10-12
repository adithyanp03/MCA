echo "Enter the string to perform operation : "
read str
l=${#str}
echo "Length of the String is : $l"
for (( i=$l-1; i>=0 ; i-- ))
do
 reverse="$reverse${str:$i:1}"
done
echo "Resverse a String : $reverse"
echo " Enter the Substring : "
read sub
if echo "$str" | grep -q "$sub"
then
	echo " Substring is found "
else
	echo " Substring is not found "
fi

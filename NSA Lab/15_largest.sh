echo "Enter the elements to the array :"
read -a array
smallest=${array[0]}
largest=${array[0]}
for num in "${array[@]}";
do
	if [ "$num" -lt "$smallest" ];
	then
		smallest=$num
	fi
	if [ "$num" -gt "$largest" ];
	then
		largest=$num
	fi
done
echo "Maximum element is : $largest"
echo "Minimum element is : $smallest"

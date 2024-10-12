echo "Enter the element of the array : "
read -a array
sum=0
for num in "${array[@]}";
do
(( sum += num ))
done
l=${#array[@]}
average=$((sum/l))
echo "The array is : ${array[@]}"
echo "Sum is : $sum"
echo "Average is: $average"

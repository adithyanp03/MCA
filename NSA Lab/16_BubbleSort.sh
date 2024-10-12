echo "Enter the elements in the array"
read -a arr
len=${#arr[@]}
for (( i=0; i<len; i++ ))
do 
  for (( j=0; j<len-i-1; j++ ))
  do 
    if [ ${arr[j]} -gt ${arr[j+1]} ]
    then
      t=${arr[j]}
      arr[j]=${arr[j+1]}
      arr[j+1]=$t
    fi
  done
done
echo "The sorted array:${arr[@]}"

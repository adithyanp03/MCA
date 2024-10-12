fib_rec(){
	n=$1
	if [ $n -le 1 ]
	then
		echo $n
	else
		echo $(( $(fib_rec $((n-1))) +$(fib_rec $((n-2))) ))
	fi
}

fib_itr(){
	n=$1
	tmp1=0
	tmp2=1
	result=0
	if [ $n -eq 0 ]
	then
	 echo $tmp1
	 return
	fi
	for ((i=2;i<=n;i++));do
	result=$((tmp1+tmp2))
	tmp1=$tmp2
	tmp2=$result
	done
	echo $result
}

echo "Enter the number : "
read num
result=$(fib_itr $num)
echo "The iterative function : $result"
result1=$(fib_rec $num)
echo "The recursive function : $result1"

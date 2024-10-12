prime(){
	num=$1
	flag=true
	if [ $num -lt 2 ];then
		flag=false
	fi
	for ((i=2;i*i<=num;i++));do
		if [ $((num%i)) -eq 0 ]
		then
			flag=false
			break
		fi
	done
	
	if [ "$flag" -eq true ];then
		echo "$num is a prime number"
	else
		echo "$num is not a prime number"
	fi
}

echo "Enter a Number : "
read num
prime "$num"

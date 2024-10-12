sum=0
for num in "$@"
do
	sum=$((sum+num))
done
echo "The sum is $sum"

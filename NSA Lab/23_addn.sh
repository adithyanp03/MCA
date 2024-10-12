echo " Enter the no of User "
read n
for ((i=0;i<n;i++))
do
	echo " Enter the Username : "
	read user
	sudo adduser "$user"
done

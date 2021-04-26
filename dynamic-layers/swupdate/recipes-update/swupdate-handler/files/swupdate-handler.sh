#!/bin/sh

sleep 5

if test -b "/dev/sda1"; then                                                                  
	mount /dev/sda1 /media                                                                               
	
	if test -f "/media/dh-preupdate.sh"; then
		sh /media/dh-preupdate.sh
	fi
	if test -f "/media/*.swu"; then
		swupdate -i /media/*.swu -H production:1.0 -v
		if test ! $? -eq 0; then
			echo "Update failed"
			exit 1
		fi
	fi
	if test -f "/media/dh-postupdate.sh"; then
		sh /media/dh-postupdate.sh
	fi

#	fw_setenv force_normalboot 1
	sleep 2
#	reboot
else
	echo "No valid update option available... waiting..."
	sleep 2
#	reboot
fi                          

echo "Please remove USB device and reboot... waiting..."
exit 0

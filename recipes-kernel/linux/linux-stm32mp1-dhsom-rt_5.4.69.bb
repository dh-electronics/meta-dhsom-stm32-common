SUMMARY = "Linux Kernel provided and supported by DH electronics"
DESCRIPTION = "Linux Kernel provided and supported by DH electronics with focus STM32MP1"

require recipes-kernel/linux/linux-stm32mp1-dhsom.inc
LIC_FILES_CHKSUM="file://COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"

DEPENDS += "lzop-native bc-native"

# select branch 
SRCBRANCH = "dev/5.4.69-rt_dhsom"

# use latest source
SRCREV = "${AUTOREV}"

LOCALVERSION = "-dev5469"

#SRC_URI += "file://0001-.....patch"

COMPATIBLE_MACHINE = "(dh-stm32mp1-dhcom-pdk2|dh-stm32mp1-dhcor-avenger96|dh-stm32mp1-dhcom-drc02|dh-stm32mp1-dhcom-picoitx)"
BB_STRICT_CHECKSUM = "0"





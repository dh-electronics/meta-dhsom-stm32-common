SUMMARY = "Linux Kernel provided and supported by DH electronics"
DESCRIPTION = "Linux Kernel provided and supported by DH electronics with focus STM32MP1"

require recipes-kernel/linux/linux-stm32mp1-dhsom.inc
LIC_FILES_CHKSUM="file://COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"

DEPENDS += "lzop-native bc-native"

# select branch 
SRCBRANCH = "dev/5.4.40_dhsom"

# use latest source
SRCREV = "${AUTOREV}"

LOCALVERSION = "-dev5440"

#SRC_URI += "file://0001-.....patch"

COMPATIBLE_MACHINE = "(dh-stm32mp1-dhcom-common-pdk2)"
BB_STRICT_CHECKSUM = "0"





SUMMARY = "Linux Kernel provided and supported by DH electronics"
DESCRIPTION = "Linux Kernel provided and supported by DH electronics with focus STM32MP1"

require recipes-kernel/linux/linux-stm32mp1-dhsom.inc
LIC_FILES_CHKSUM="file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

DEPENDS += "lzop-native bc-native"

# select branch 
SRCBRANCH = "dev/5.10.12_dhsom"

# use latest source
SRCREV = "${AUTOREV}"

LOCALVERSION = "-dev51012"

#SRC_URI += "file://0001-.....patch"

COMPATIBLE_MACHINE = "(dh-stm32mp1-dhcom-pdk2|dh-stm32mp1-dhcor-avenger96|dh-stm32mp1-dhcom-drc02|dh-stm32mp1-dhcom-picoitx)"
BB_STRICT_CHECKSUM = "0"

# OE-core 740d87766c ("kernel.bbclass: Configuration for environment with HOSTCXX")
EXTRA_OEMAKE += " HOSTCXX="${BUILD_CXX} ${BUILD_CXXFLAGS} ${BUILD_LDFLAGS}" "





if (isNotEmpty(devicesInstallAppCompletedMap.get(classroomId))) {
            
            if (isNotEmpty(devicesInstallAppCompletedMap.get(classroomId).get(packageName))) {
                pushDeviceList.removeAll(devicesInstallAppCompletedMap.get(classroomId).get(packageName));
            }
        }